package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Preparation_1158 : Card() {
    override val id = 1158
    override val name = "伺机待发"
    override val description = "在本回合中，你所施放的下一个法术的法力值消耗减少（2）点。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy3
    override val background = "“随时准备伺机待发。”——潜行者座右铭"
    override val artist = "Clint Langley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c1f13879b4e0bc6b89bbca458c8891fa8f32df6676ee296576d5186033d4e019.png"
}
