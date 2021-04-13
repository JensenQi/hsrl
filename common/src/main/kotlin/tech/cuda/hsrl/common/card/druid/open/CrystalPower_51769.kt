package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrystalPower_51769 : Card() {
    override val id = 51769
    override val name = "水晶之力"
    override val description = "<b>抉择：</b>对一个随从造成 2点伤害；或者恢复 5点生命值。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RiseOfShadows
    override val background = "谁说中看不中用来着，丢你一下试试……"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/999de20337d22dad4162dae19421465cf98f495547b8accca1048dbe2dde5c81.png"
}
