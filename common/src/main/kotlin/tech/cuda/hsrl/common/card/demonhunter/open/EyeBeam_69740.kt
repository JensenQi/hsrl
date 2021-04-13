package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EyeBeam_69740 : Card() {
    override val id = 69740
    override val name = "眼棱"
    override val description = "<b>吸血</b>。 对一个随从造成 3点伤害。<b>流放：</b>法力值消耗为（1）点。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "有时眼神也可以杀人。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3082c1ca47e5391f07c932a0133db62385a764eda6befbfec4d4ef7b86370b00.png"
}
