package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Mulchmuncher_48831 : Card() {
    override val id = 48831
    override val name = "植被破碎机"
    override val description = "<b>突袭</b> 在本局对战中，每有一个友方树人死亡，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 9
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.BoomsdayProject
    override val background = "仿生科技的最新成果。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6b75b7464270a65c9d0174608a3099a13b0b34e8e419b1202f8707f09bf75741.png"
}
