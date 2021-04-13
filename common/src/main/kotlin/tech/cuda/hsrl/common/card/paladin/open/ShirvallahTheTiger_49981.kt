package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShirvallahTheTiger_49981 : Card() {
    override val id = 49981
    override val name = "西瓦尔拉，猛虎之神"
    override val description = "<b>圣盾，突袭，吸血</b> 每当你消耗1点法力值用于法术牌上，这张牌的法力值消耗减少（1）点。"
    override var cost: Int? = 25
    override var health: Int? = 5
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RastakhansRumble
    override val background = "塞卡尔跪在神龛前摆好了供品，西瓦尔拉总会用小爪子把它拨到地上。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/71364380b172de2f6e79b184d963988a1451544bfcadbe2722bbe0b029a3ef54.png"
}
