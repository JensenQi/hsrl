package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IronbarkProtector_205 : Card() {
    override val id = 205
    override val name = "埃隆巴克保护者"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 8
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy1635
    override val background = "我打赌你一定不敢进攻达纳苏斯。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a54a7862385e4abd830097996e09eff26e0f72a8e0e127c7455a648d42be8c5.png"
}
