package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArborUp_61964 : Card() {
    override val id = 61964
    override val name = "树木生长"
    override val description = "召唤两个2/2的树人。使你的随从获得+2/+1。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "要是连大树都能超过你，那你真的不该来这里。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/564497f8d0d32dd76dde0403d35c833570cfff9abfc30d0907e47898ce5ccc39.png"
}
