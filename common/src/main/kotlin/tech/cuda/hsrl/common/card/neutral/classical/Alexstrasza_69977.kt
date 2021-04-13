package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Alexstrasza_69977 : Card() {
    override val id = 69977
    override val name = "阿莱克丝塔萨"
    override val description = "<b>战吼：</b> 将一方英雄的剩余生命值变为15。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "生命的缚誓者阿莱克丝塔萨给所有人带来生命和希望。除了死亡之翼。除了玛里苟斯。除了耐克鲁斯。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2d6f0e9dbb197c50142a29cf6096e04bd9a094ab632c6918238755ffb8ebe200.png"
}
