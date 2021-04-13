package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RainOfFire_54893 : Card() {
    override val id = 54893
    override val name = "火焰之雨"
    override val description = "对所有角色造成 1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.DescentOfDragons
    override val background = "秋天的天气你懂的。古云：七月硫火……"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6bd040d15c6df951b79df80169f007998926632d2db035fcac955d35fb0b3b9b.png"
}
