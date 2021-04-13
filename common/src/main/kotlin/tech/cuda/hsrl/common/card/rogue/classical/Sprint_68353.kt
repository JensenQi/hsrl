package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sprint_68353 : Card() {
    override val id = 68353
    override val name = "疾跑"
    override val description = "抽四张牌。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "潜行者们通常都不擅长慢跑。"
    override val artist = "James Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c351c647b4fc7ce2b3d17d120df84c124ce074b5477dbea03d361c3f62c71634.png"
}
