package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Minefield_61238 : Card() {
    override val id = 61238
    override val name = "雷区挑战"
    override val description = "造成 5点伤害，随机分配到所有随从身上。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "就像玩扫雷加上坦克大战一样躲开炸弹！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6bd2dab5daf31569af8761a8419a2bb5ac3e9a2ad51e6bd26498f698924fe67d.png"
}
