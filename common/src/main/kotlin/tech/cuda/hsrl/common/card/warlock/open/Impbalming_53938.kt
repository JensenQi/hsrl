package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Impbalming_53938 : Card() {
    override val id = 53938
    override val name = "小鬼油膏"
    override val description = "消灭一个随从。将三张“游荡小鬼”洗入你的牌库。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "小鬼油膏，给你的肌肤带来一层强大的保湿魔。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7cca1a955af8a0a1c27b9feaaa02d402dc8faf5663c3de7000cec359ee869ddb.png"
}
