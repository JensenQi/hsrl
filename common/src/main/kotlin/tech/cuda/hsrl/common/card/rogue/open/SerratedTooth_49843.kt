package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SerratedTooth_49843 : Card() {
    override val id = 49843
    override val name = "锯刃齿"
    override val description = "<b>亡语：</b>使你的所有随从获得<b>突袭</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RastakhansRumble
    override val background = "好痛！这也太真实了吧！"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/116545999fa39fddc1360ee267b5fcfe3659fca57187cf01ea351cd1d6ba97c5.png"
}
