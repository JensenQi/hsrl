package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SavageRoar_742 : Card() {
    override val id = 742
    override val name = "野蛮咆哮"
    override val description = "在本回合中，使你的所有角色获得+2攻击力。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy1635
    override val background = "显然这对火元素和水元素也有作用。难道这说明元素也是长耳朵的吗？"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/632d57db7eafaa7866899e198391f46646b5c7f1553c418cfaada244af867cc5.png"
}
