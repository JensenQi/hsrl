package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScrewjankClunker_2023 : Card() {
    override val id = 2023
    override val name = "废旧螺栓机甲"
    override val description = "<b>战吼：</b>使一个友方机械获得+2/+2。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Gvg
    override val background = "如果它坏了，踢它几下然后再骂一句：“什么破玩意儿！”"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f60ac016f884cadac48a1a2b59e2ef20898b9e091ff24cc94604fd328b3bb2b5.png"
}
