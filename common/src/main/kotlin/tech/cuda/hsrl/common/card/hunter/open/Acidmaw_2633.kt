package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Acidmaw_2633 : Card() {
    override val id = 2633
    override val name = "酸喉"
    override val description = "每当有其他随从受到伤害，将其消灭。"
    override var cost: Int? = 7
    override var health: Int? = 2
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Tgt
    override val background = "在老伙计恐鳞的帮助下，酸喉能够轻易地咬穿板甲。看来有些骑士要倒大霉了！"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/df2e949836535bb1f97990179da96b2c90bbdcf7cb6fbf613bc0eb418d1c2ace.png"
}
