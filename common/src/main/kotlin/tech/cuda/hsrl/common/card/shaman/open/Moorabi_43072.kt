package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Moorabi_43072 : Card() {
    override val id = 43072
    override val name = "莫拉比"
    override val description = "每当有其他随从被<b>冻结</b>，将一张被<b>冻结</b>随从的复制置入你的 手牌。"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Kotf
    override val background = "莫拉比究竟是怎么给那些冻结的随从涂上风味糖浆的，这是一个世纪谜题。"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/28a65572ea8d6d0c6044209da2e8c28b66f7d4a34eb208c0ea5410d17e35cba4.png"
}
