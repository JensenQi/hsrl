package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Snipe_814 : Card() {
    override val id = 814
    override val name = "狙击"
    override val description = "<b>奥秘：</b>在你的对手使用一张随从牌后，对该随从造成 4点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Legacy3
    override val background = "伟大的狙击手总是能够正中目标。就像吃下一整块猪肋排。嗯，味道好极了。"
    override val artist = "Lorenzo Minaca"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f8b06c8d324ef46b5efced27276b68133f448a9fcadc767d564c4778e9ad0d74.png"
}
