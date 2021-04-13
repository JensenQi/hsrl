package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnstableGhoul_1808 : Card() {
    override val id = 1808
    override val name = "蹒跚的食尸鬼"
    override val description = "<b>嘲讽，亡语：</b>对所有随从造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "最近，给食尸鬼喂食火箭燃料是各大死灵学院最为流行的玩法。"
    override val artist = "Mike Nicholson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f43e8d9430d72d0b57394a03148677c3ecd17dfe0dc16c7b28f8b681b3a1f33f.png"
}
