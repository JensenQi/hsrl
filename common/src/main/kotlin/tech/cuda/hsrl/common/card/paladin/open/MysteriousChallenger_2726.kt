package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MysteriousChallenger_2726 : Card() {
    override val id = 2726
    override val name = "神秘挑战者"
    override val description = "<b>战吼：</b>将每种不同的<b>奥秘</b>从你的牌库中置入战场。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Tgt
    override val background = "别看他出言不逊，玩世不恭，其实他是个很内向的人。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/955ebb881221e9f7440c33a1a33286832a0ddea0aec99efec5cbe91eb46ebb1d.png"
}
