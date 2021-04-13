package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrimalfinTotem_41105 : Card() {
    override val id = 41105
    override val name = "蛮鱼图腾"
    override val description = "在你的回合结束时，召唤一个1/1的鱼人。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Totem
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Ungoro
    override val background = "蛮鱼图腾会播放只有鱼人才能听到的声音，也还好只有他们能听到…"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/705c4a5cb5b3e128864cf498a377d45dd805c317c4977665faf6e678d2d7e320.png"
}
