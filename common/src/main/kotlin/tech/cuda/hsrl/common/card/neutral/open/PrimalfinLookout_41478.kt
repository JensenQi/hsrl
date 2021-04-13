package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrimalfinLookout_41478 : Card() {
    override val id = 41478
    override val name = "蛮鱼斥候"
    override val description = "<b>战吼：</b>如果你控制其他任何鱼人，则<b>发现</b>一张鱼人牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "他的鼻子像猎犬一样灵敏，总能嗅出其他鱼人的气味。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/243c822d06accbe129de7df4c89402d5b3af2bc65aa6303bf6ccc064ff14474e.png"
}
