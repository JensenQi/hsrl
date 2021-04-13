package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Lightwell_797 : Card() {
    override val id = 797
    override val name = "光明之泉"
    override val description = "在你的回合开始时，随机为一个受伤的 友方角色恢复 3点生命值。"
    override var cost: Int? = 2
    override var health: Int? = 5
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy3
    override val background = "以前有很多牧师都不明白，究竟是因为队友看不见光明之泉呢，还是他们故意不想点它呢？"
    override val artist = "Blizzard Entertainment"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1667b6a9781ccb3e44cb815ad6c87f6f9e59c96ecdbace8cade65d9aff782120.png"
}
