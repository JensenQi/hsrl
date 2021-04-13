package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HalazziTheLynx_50659 : Card() {
    override val id = 50659
    override val name = "哈尔拉兹，山猫之神"
    override val description = "<b>战吼：</b>将1/1并具有<b>突袭</b>的山猫置入你的手牌，直到你的手牌数量达到上限。"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.RastakhansRumble
    override val background = "山猫种群的强度取决于最弱的那一只。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bc5115a87603143687312efd316bd18b864de605bb2f0a2197e885345e75e268.png"
}
