package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Thunderhead_48527 : Card() {
    override val id = 48527
    override val name = "雷云元素"
    override val description = "在你使用一张<b>过载</b>牌后，召唤两个1/1并具有<b>突袭</b>的“火花”。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.BoomsdayProject
    override val background = "他绝大多数的朋友是重金属元素。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d9bd201f7e1c6d15322c5426018bf6c9391105eab241d7ac2309fd171a5a4b0c.png"
}
