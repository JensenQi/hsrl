package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForgottenTorch_2874 : Card() {
    override val id = 2874
    override val name = "老旧的火把"
    override val description = "造成 3点伤害。将一张可造成6点伤害的“炽烈的火把”洗入你的牌库。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Loe
    override val background = "探险者经常需要在黑暗潮湿的环境下进行考古工作，因此火把成了必不可少的工具之一。"
    override val artist = "Richard Wright"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1ef297e2e490003164f07a9fb67140df37d1cf7e67a9624d32ae77ddd08fa1fa.png"
}
