package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TogwagglesScheme_51375 : Card() {
    override val id = 51375
    override val name = "托瓦格尔的阴谋"
    override val description = "选择一个随从。将它的1张复制洗入你的牌库。<i>（每回合都会升级！）</i>"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RiseOfShadows
    override val background = "“随从越多，我的财宝越多。狗头人就这么算账！”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ca58b5f6bfcdd5b6f0a19359469c3972452215846f279124ba5d8d87bbbbe98f.png"
}
