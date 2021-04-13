package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeckOfWonders_43424 : Card() {
    override val id = 43424
    override val name = "惊奇套牌"
    override val description = "将五张惊奇卡牌洗入你的牌库。抽到时随机施放一个 法术。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“挑一张卡吧，哪张都行。等等！不！别动那张！”——之前一个主人的遗言"
    override val artist = "Efrem Palacios"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/45cb8195b0eb44cfe5e68f2043dabdb6ad90d9498ef3d83e1c8fad251919bcab.png"
}
