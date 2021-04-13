package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Subject_49447 : Card() {
    override val id = 49447
    override val name = "实验体9号"
    override val description = "<b>战吼：</b> 从你的牌库中抽五张不同的<b>奥秘</b>牌。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "她是最聪明的那一只。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/18b91ada62591c30c8329b4a377e87b4f7fbde8503935c33a64b00d4699efa9c.png"
}
