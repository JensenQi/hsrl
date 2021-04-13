package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DivineHymn_47549 : Card() {
    override val id = 47549
    override val name = "神圣赞美诗"
    override val description = "为所有友方角色恢复 6点 生命值。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.TheWitchwood
    override val background = "再往上高八度，就能对玻璃骑士造成致命的伤害。"
    override val artist = "Tom Baxa"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7f22846231829a778b58bd7702552cbc98ac31b77880c669bc1f083d6c807837.png"
}
