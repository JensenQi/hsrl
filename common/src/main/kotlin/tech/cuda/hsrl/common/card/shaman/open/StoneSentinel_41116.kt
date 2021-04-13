package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StoneSentinel_41116 : Card() {
    override val id = 41116
    override val name = "岩石哨兵"
    override val description = "<b>战吼：</b>如果你在上个回合使用过元素牌，则召唤两个2/3并具有<b>嘲讽</b>的元素。"
    override var cost: Int? = 7
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Ungoro
    override val background = "他只是想和他的小伙伴们一起摇摆。"
    override val artist = "Rudy Siswanto"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b4776d299ff8b6493a44eee437e1c7a2ace0d501eb690b579d36e647993fb992.png"
}
