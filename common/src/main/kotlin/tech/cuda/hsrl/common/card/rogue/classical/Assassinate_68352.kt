package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Assassinate_68352 : Card() {
    override val id = 68352
    override val name = "刺杀"
    override val description = "消灭一个敌方随从。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "要是你不想被人暗杀，躲到贫瘠之地，然后隐姓埋名。祝你好运！"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/38c1e94f5c2264422a0e0b0fa5ffd12e6d8f49ece5a14eee5ce6831d7b8f64ee.png"
}
