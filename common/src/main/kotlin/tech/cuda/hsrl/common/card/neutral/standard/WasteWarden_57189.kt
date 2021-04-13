package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WasteWarden_57189 : Card() {
    override val id = 57189
    override val name = "废土守望者"
    override val description = "<b>战吼：</b> 对一个随从及所有随从类型相同的其他随从造成3点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "把废土扔进干垃圾桶，不然就把你铐起来！"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cd303dd4f97705157e8f9bba68ae3ea6b5a8d5b4287e960bd5c0d09269856922.png"
}
