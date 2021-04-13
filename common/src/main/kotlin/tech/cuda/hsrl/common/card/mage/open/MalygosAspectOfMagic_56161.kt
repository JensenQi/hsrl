package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MalygosAspectOfMagic_56161 : Card() {
    override val id = 56161
    override val name = "织法巨龙玛里苟斯"
    override val description = "<b>战吼：</b> 如果你的手牌中有龙牌，便<b>发现</b>一张升级过的法师法术牌。"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.DescentOfDragons
    override val background = "官宣：也可以叫他玛里狗斯。"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/40636d39a618f255a2c96a8090ec977ad4bd4c09c69a19ddeb4e871fe0dd99ea.png"
}
