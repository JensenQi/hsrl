package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JadeLightning_40455 : Card() {
    override val id = 40455
    override val name = "青玉闪电"
    override val description = "造成 4点伤害，召唤一个 的<b>青玉魔像</b>。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Msog
    override val background = "你是电，你是光，你是唯一的传奇！"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d4210872da787f985620cc68b37f24ff62c400cde4bd8e1517bb0cd4d2dd8a90.png"
}
