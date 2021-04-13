package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DefiasCleaner_40745 : Card() {
    override val id = 40745
    override val name = "迪菲亚清道夫"
    override val description = "<b>战吼：</b><b>沉默</b>一个具有<b>亡语</b>的随从。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "他偶尔也会兼职做家政服务，只不过打扫完后你的贵重财物都不见了…"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2efc2be071b5d7689fe6c129a5e8a7b5b3dac7d99fb267f2da248f91900ec592.png"
}
