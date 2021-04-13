package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IKnowAGuy_40839 : Card() {
    override val id = 40839
    override val name = "盛气凌人"
    override val description = "<b>发现</b>一张具有<b>嘲讽</b>的随从牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Msog
    override val background = "你给我小心点…我上头有人！"
    override val artist = "Kan Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c0c12ff2906c2aee9da16161760e3fc3d4cb43518e2e0cb5feb22cc85d236465.png"
}
