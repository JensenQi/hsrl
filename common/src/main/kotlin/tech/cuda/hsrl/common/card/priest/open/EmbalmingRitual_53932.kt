package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EmbalmingRitual_53932 : Card() {
    override val id = 53932
    override val name = "防腐仪式"
    override val description = "使一个随从获得<b>复生</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“你猜发生了什么！我们又有了一只新的小猫。”"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fc5617e3093e42a1f03eceda9d69ac0b3156becde9e009b0ae16a804814dfe1e.png"
}
