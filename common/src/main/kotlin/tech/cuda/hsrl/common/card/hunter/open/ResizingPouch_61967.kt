package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ResizingPouch_61967 : Card() {
    override val id = 61967
    override val name = "随心口袋"
    override val description = "<b>发现</b>一张法力值消耗等同于你剩余法力水晶数量的卡牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "不要在随心口袋里面再套一个随心口袋。"
    override val artist = "None"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aef776a1f1944cc5bee49db7b52291ab592641cd5f05dfa2112523b985a5fe29.png"
}
