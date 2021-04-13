package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SphereOfSapience_59151 : Card() {
    override val id = 59151
    override val name = "感知宝珠"
    override val description = "在你的回合开始时，检视你牌库顶的卡牌。你可以将其置于牌库底，并失去1点耐久度。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "当一张牌沉入牌库底，当一局牌成了谜。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d5e37d0f720b6ca5f6b4c76d86ab227ab6264a50d747c8c87552756596a3d048.png"
}
