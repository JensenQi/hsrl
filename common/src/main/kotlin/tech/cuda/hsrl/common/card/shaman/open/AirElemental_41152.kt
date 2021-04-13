package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AirElemental_41152 : Card() {
    override val id = 41152
    override val name = "空气元素"
    override val description = "无法成为法术或英雄技能的目标。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Ungoro
    override val background = "那种没人在意你的感觉，是永远的痛。"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/104c86ddb713285298d4d564a182ca066646697d329595cf5cfe62b03050c18f.png"
}
