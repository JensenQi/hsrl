package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowVisions_41169 : Card() {
    override val id = 41169
    override val name = "暗影视界"
    override val description = "从你的牌库中<b>发现</b>一张法术牌的复制。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Ungoro
    override val background = "听说念咒语不跳舞，成功概率要减半！"
    override val artist = "Nutchapol Thitinunthakorn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/017d5708eff157b24087535ca619fab0e900e827fdb127f181e4d6a0daf1cee2.png"
}
