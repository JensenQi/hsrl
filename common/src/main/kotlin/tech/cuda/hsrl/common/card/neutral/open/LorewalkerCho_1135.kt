package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LorewalkerCho_1135 : Card() {
    override val id = 1135
    override val name = "游学者周卓"
    override val description = "每当一个玩家施放一个法术，复制该法术，将其置入另一个玩家的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "游学者周卓整理并分享有关潘达利亚大陆的轶事，但他最喜欢的故事，是乔伊和菲比一起外出旅行发生的事情。"
    override val artist = "Mark Zug"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3d8de7f7d7bdbb66dc25f13eb1ffbf94f0dc37e3c750fdb424831f8fa99c7fb4.png"
}
