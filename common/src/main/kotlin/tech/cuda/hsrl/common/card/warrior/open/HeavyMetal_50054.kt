package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HeavyMetal_50054 : Card() {
    override val id = 50054
    override val name = "重金属狂潮"
    override val description = "随机召唤一个法力值消耗等同于你的护甲值<i>（最高不超过10点）</i>的随从。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RastakhansRumble
    override val background = "这些金属足够重，够你用到明年了。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/47b25de274c9f9c406397f7ced3fcba500f4df7f5c09d2e1c577b0d7cfaded21.png"
}
