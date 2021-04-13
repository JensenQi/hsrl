package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Assassinate_345 : Card() {
    override val id = 345
    override val name = "刺杀"
    override val description = "消灭一个敌方随从。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy1635
    override val background = "要是你不想被人暗杀，躲到贫瘠之地，然后隐姓埋名。祝你好运！"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8f1acbd9cc8325b6c79f95f8d2203b74dcf586327f402affcfa19da1a3bc360e.png"
}
