package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LorewalkerCho_69847 : Card() {
    override val id = 69847
    override val name = "游学者周卓"
    override val description = "每当一个玩家施放一个法术，复制该法术，将其置入另一个玩家的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "游学者周卓整理并分享有关潘达利亚大陆的轶事，但他最喜欢的故事，是乔伊和菲比一起外出旅行发生的事情。"
    override val artist = "Mark Zug"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a3150da6f36963fc880fc2bf2ddf3b0902582ad7ba1af3ec51e1aa5c1ed89686.png"
}
