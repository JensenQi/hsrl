package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Alexstrasza_581 : Card() {
    override val id = 581
    override val name = "阿莱克丝塔萨"
    override val description = "<b>战吼：</b> 将一方英雄的剩余生命值变为15。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "生命的缚誓者阿莱克丝塔萨给所有人带来生命和希望。除了死亡之翼。除了玛里苟斯。除了耐克鲁斯。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8b5f582f0d202222146824013b7851d65a95cf3f5b31a2ee44f23c718015c34b.png"
}
