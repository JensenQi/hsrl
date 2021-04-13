package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DuskfallenAviana_47819 : Card() {
    override val id = 47819
    override val name = "暮陨者艾维娜"
    override val description = "在每个玩家的回合中，使用的第一张牌法力值消耗为（0）点。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.TheWitchwood
    override val background = "“你才像翠迪，你全家都像翠迪！”"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/30699ba174172d192d4abeda4a5c36f92702bb8defbb699bd5d6f96e6211310b.png"
}
