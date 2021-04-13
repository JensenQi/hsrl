package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EyeBeam_58183 : Card() {
    override val id = 58183
    override val name = "眼棱"
    override val description = "<b>吸血</b>。 对一个随从造成 3点伤害。<b>流放：</b>法力值消耗为（1）点。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "有时眼神也可以杀人。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d7ea5da9d5125c930f349d4a499523e67cc7496a66bfb9c38813010b4fa61961.png"
}
