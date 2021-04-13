package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChainLightningRank1_63065 : Card() {
    override val id = 63065
    override val name = "闪电链（等级1）"
    override val description = "对一个随从和随机一个相邻随从造成 2点伤害。<i>（当你有5点法力值时升级。）</i>"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "挨一发连环闪电总比收一封连环信好受些。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/22ae9a91a44dd9a5d1422fee98c971c09da9880bb3724ee57f6169c3f055c77a.png"
}
