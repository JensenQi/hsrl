package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TipTheScales_54427 : Card() {
    override val id = 54427
    override val name = "鱼人为王"
    override val description = "从你的牌库中召唤七个鱼人。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "鱼人永不为奴！"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0d36c576cb0a0e5a4e0d3e6f159945e99165f2d79db7cd2e751b5a5c92c621e8.png"
}
