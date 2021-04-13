package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BallOfSpiders_2483 : Card() {
    override val id = 2483
    override val name = "天降蛛群"
    override val description = "召唤三个1/1的结网蛛。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Tgt
    override val background = "到处都是蜘蛛，真让人头皮发麻。"
    override val artist = "Skan Srisuwan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/29a778ff97c9f7ac784dd01af43d4603694007e6bd9a9ee698714c0b41966b8f.png"
}
