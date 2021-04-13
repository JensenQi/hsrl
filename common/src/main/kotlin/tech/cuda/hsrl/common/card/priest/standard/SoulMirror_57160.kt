package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SoulMirror_57160 : Card() {
    override val id = 57160
    override val name = "灵魂之镜"
    override val description = "召唤所有敌方随从的复制，并使敌方随从与其复制 互相攻击。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.AshesOfOutland
    override val background = "是我杀了我！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/156ddb5b76b3ee2d33f3d981ab754f6550685b66e7798d39b37de28f17d32844.png"
}
