package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class QuicksandElemental_54278 : Card() {
    override val id = 54278
    override val name = "流沙元素"
    override val description = "<b>战吼：</b>在本回合中，使所有敌方随从获得-2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "用细砂打磨小瑕疵，用粗砂打消大问题。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4fe8b1254f6547c3a2e9e07c3c9c514c10a9374f5d476333ad84e4aa177da31c.png"
}
