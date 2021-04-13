package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RavenFamiliar_45269 : Card() {
    override val id = 45269
    override val name = "乌鸦魔仆"
    override val description = "<b>战吼：</b>揭示双方牌库里的一张法术牌。如果你的牌法力值消耗较大，抽这张牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "乌鸦问道：“但代价是什么呢？”"
    override val artist = "Eva Widermann"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c0cbf0d27498ebf1a5a29dfe25f952700a4d242d539aff3f1708264ffcb94d19.png"
}
